package GInternational.server.api.mapper;

import GInternational.server.api.dto.AmazonRechargeResponseDTO;
import GInternational.server.common.generic.GenericMapper;
import GInternational.server.api.entity.Wallet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AmazonRechargeResponseMapper extends GenericMapper<AmazonRechargeResponseDTO, Wallet> {
    AmazonRechargeRequestMapper INSTANCE = Mappers.getMapper(AmazonRechargeRequestMapper.class);
}
