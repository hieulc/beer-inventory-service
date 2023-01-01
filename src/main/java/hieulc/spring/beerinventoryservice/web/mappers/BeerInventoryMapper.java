package hieulc.spring.beerinventoryservice.web.mappers;

import hieulc.spring.beerinventoryservice.domain.BeerInventory;
import hieulc.spring.beerinventoryservice.web.models.BeerInventoryDto;
import org.mapstruct.Mapper;


@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDto);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
