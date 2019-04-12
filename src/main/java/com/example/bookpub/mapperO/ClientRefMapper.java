package com.example.bookpub.mapperO;

import com.example.bookpub.dtoO.ClientRefDTO;
import com.example.bookpub.entityO.ClientRef;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public abstract class ClientRefMapper extends ModelMapper {

    PropertyMap<ClientRef, ClientRefDTO> orderMap = new PropertyMap<ClientRef, ClientRefDTO>() {
        protected void configure() {
            map().setCompanyDomain(source.getCompanyDomain());
            map().setDate(source.getDate());
            map().setDomain(source.getDomain());

        }


    };


}
