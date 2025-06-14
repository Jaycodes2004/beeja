package com.beeja.api.accounts.service;

import com.beeja.api.accounts.model.Organization.OrgDefaults;
import com.beeja.api.accounts.model.Organization.Organization;
import com.beeja.api.accounts.model.User;
import com.beeja.api.accounts.response.OrganizationResponse;
import java.util.List;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.web.multipart.MultipartFile;

public interface OrganizationService {
  List<User> getAllUsersByOrganizationId(String organizationId) throws Exception;

  OrganizationResponse getOrganizationById(String id) throws Exception;

  Organization updateOrganization(
      String organizationId, String organizationProfileUpdate, MultipartFile file) throws Exception;

  ByteArrayResource downloadOrganizationFile() throws Exception;

  OrgDefaults updateOrganizationValues(OrgDefaults orgDefaults) throws Exception;

  OrgDefaults getOrganizationValuesByKey(String key) throws Exception;

  List<OrgDefaults> getOrganizationValues(List<String> keys) throws Exception;

  void generateOrganizationDefaults() throws Exception;
}
