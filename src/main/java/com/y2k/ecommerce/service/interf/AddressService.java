package com.y2k.ecommerce.service.interf;

import com.y2k.ecommerce.dto.AddressDto;
import com.y2k.ecommerce.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
