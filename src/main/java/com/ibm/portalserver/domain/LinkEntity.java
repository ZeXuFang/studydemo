package com.ibm.portalserver.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkEntity {

    private DeptEntity deptEntity;

    private  UserEntity userEntity;
}
