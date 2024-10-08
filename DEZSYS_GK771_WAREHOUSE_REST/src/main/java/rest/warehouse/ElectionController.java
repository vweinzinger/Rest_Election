package rest.warehouse;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.MediaType;

import rest.model.ElectionData;

@RestController
public class ElectionController {

    @Autowired
    private ElectionService service;

    @RequestMapping("/")
    public String warehouseMain() {
        String mainPage = "Nationalratswahl Ergebnisse in JSON und XML: <br/><br/>" +
                "<a href='http://localhost:8080/warehouse/001/json'>Link to warehouse/001/json</a><br/>";

        mainPage += "<a href='http://localhost:8080/warehouseXML/001/xml'>Link to warehouseXML/001/xml</a><br/>";
        return mainPage;
    }

    @RequestMapping(value="/warehouse/{inID}/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public ElectionData warehouseData(@PathVariable String inID ) {
        return service.getWarehouseData( inID );
    }

    @RequestMapping(value="/warehouseXML/{inID}/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public ElectionData warehouseDataXML(@PathVariable String inID ) {
        return service.getWarehouseData( inID );
    }

}