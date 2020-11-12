package bt.gov.ditt.dairy.controller;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.wso2.client.api.DCRC_CitizenDetailsAPI.DefaultApi;
import org.wso2.client.model.DCRC_CitizenDetailsAPI.CitizenDetailsResponse;
import org.wso2.client.model.DCRC_CitizenDetailsAPI.CitizendetailsObj;
import org.wso2.client.model.G2C_CommonBusinessAPI.UserRolePrivilegeHierarchyObj;
import org.wso2.client.model.G2C_CommonBusinessAPI.UserRolePrivilegeHierarchyResponse;

import com.squareup.okhttp.OkHttpClient;

import bt.gov.ditt.dairy.model.FarmerDetailCensus;
import bt.gov.ditt.dairy.services.FarmerDetailsCensusService;


@RestController
public class FarmerDetailsCensusController {
	
	@Autowired
	private FarmerDetailsCensusService farmerDetailsCensusService;
	
	@CrossOrigin
	@RequestMapping("/census-api")
	public List<FarmerDetailCensus> getAllFarmersDetailFromCensusApi() {
		return farmerDetailsCensusService.getAllFarmersDetailFromCensusApi();
	}
	
	@CrossOrigin
	@RequestMapping(value="/census-api/{cid_number}")
	public FarmerDetailCensus getFarmerDetailsFromCid(@PathVariable("cid_number") String cid_number) {
		return farmerDetailsCensusService.getFarmerDetailsFromCid(cid_number);
	}
	
	@ResponseBody
    @RequestMapping(value="/getCitizenDetails/{cid_number}",method = RequestMethod.GET)
	public FarmerDetailCensus getFarmerDetailsFromCid(@PathVariable("cid_number") String cid_number,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FarmerDetailCensus farmerDetailCensus = new FarmerDetailCensus();
        CitizendetailsObj citizendetailsObj = null;
        try {
            OkHttpClient httpClient = new OkHttpClient();
            httpClient.setConnectTimeout(10000, TimeUnit.MILLISECONDS);
            httpClient.setReadTimeout(10000, TimeUnit.MILLISECONDS);

            org.wso2.client.api.ApiClient apiClient = new org.wso2.client.api.ApiClient();
            apiClient.setHttpClient(httpClient);
            apiClient.setBasePath("https://staging-datahub-apim.dit.gov.bt/dcrc_citizen_details_api/1.0.0/");
			/*
             * HttpSession session = request.getSession(); TokenDTO tokendto = (TokenDTO)
			 * session.getAttribute("TOKEN");
			 */
            apiClient.setAccessToken("1a1e7391-07c4-3763-b4eb-2c30c810d80d");

            DefaultApi api = new DefaultApi(apiClient);
            CitizenDetailsResponse citizenDetailsResponse = api.citizendetailsCidGet(cid_number);

            if (citizenDetailsResponse.getCitizenDetailsResponse().getCitizenDetail() != null && !citizenDetailsResponse.getCitizenDetailsResponse().getCitizenDetail().isEmpty()) {
            	citizendetailsObj = citizenDetailsResponse.getCitizenDetailsResponse().getCitizenDetail().get(0);
                farmerDetailCensus.setCid_number(citizendetailsObj.getCid());
                farmerDetailCensus.setName(citizendetailsObj.getFirstName() + " " + citizendetailsObj.getMiddleName() + citizendetailsObj.getLastName());
                farmerDetailCensus.setName(farmerDetailCensus.getName().replaceAll("null", ""));
                //farmerDetailCensus.setName(citizendetailsObj.getFirstName());
                farmerDetailCensus.setDzongkhag(citizendetailsObj.getDzongkhagName());
                farmerDetailCensus.setGewog(citizendetailsObj.getGewogName());
                farmerDetailCensus.setVillage(citizendetailsObj.getVillageName());
            }
        } catch (Exception e) {
            System.out.println("Error at GetCitizenDetails[doAction]" + e);
        }
        return farmerDetailCensus;

	}
	
	@ResponseBody
    @RequestMapping(value="/userLogin/{uid}",method = RequestMethod.GET)
	public UserRolePrivilegeHierarchyObj userLogin(@PathVariable("uid") String uid,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserRolePrivilegeHierarchyObj userRolePrivilegeObj = null;
          

         
            OkHttpClient httpClient = new OkHttpClient();
            httpClient.setConnectTimeout(10000, TimeUnit.MILLISECONDS);
            httpClient.setReadTimeout(10000, TimeUnit.MILLISECONDS);

            org.wso2.client.api.ApiClient apiClient = new org.wso2.client.api.ApiClient();
            apiClient.setHttpClient(httpClient);
            apiClient.setBasePath("https://staging-datahub-apim.dit.gov.bt/g2c_common_business_api/1.0.0");

            // HttpSession session = request.getSession();
            //TokenDTO tokendto = (TokenDTO) session.getAttribute("TOKEN");
            apiClient.setAccessToken("1a1e7391-07c4-3763-b4eb-2c30c810d80d");

            try{
            	org.wso2.client.api.G2C_CommonBusinessAPI.DefaultApi api = new org.wso2.client.api.G2C_CommonBusinessAPI.DefaultApi(apiClient);
                UserRolePrivilegeHierarchyResponse userRolePrivilegeResponse = api.userroleprivilegehierarchyUseridDeptshortcodeGet(uid, "M_MOA.D_DOL");
                

                if (userRolePrivilegeResponse.getUserRolePrivilegeHierarchyResponse().getUserRolePrivilegeHierarchy() != null
                        && !userRolePrivilegeResponse.getUserRolePrivilegeHierarchyResponse().getUserRolePrivilegeHierarchy().isEmpty()) {
                    userRolePrivilegeObj = userRolePrivilegeResponse.getUserRolePrivilegeHierarchyResponse().getUserRolePrivilegeHierarchy().get(0);

                }
            }
            catch(Exception e) {
            	e.printStackTrace();
            }
            
            return userRolePrivilegeObj;
	}
	
	
}
