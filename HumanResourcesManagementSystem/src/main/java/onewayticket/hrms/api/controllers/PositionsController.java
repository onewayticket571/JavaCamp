package onewayticket.hrms.api.controllers;

import onewayticket.hrms.business.abstracts.PositionService;
import onewayticket.hrms.core.utilities.results.DataResult;
import onewayticket.hrms.core.utilities.results.Result;
import onewayticket.hrms.core.utilities.results.SuccessResult;
import onewayticket.hrms.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
public class PositionsController {
    private PositionService positionService;

    @Autowired
    public PositionsController(PositionService positionService) {
        this.positionService = positionService;
    }

    @GetMapping("/getall")
    public DataResult<List<Position>> getAll(){
        return this.positionService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Position position){
        return this.positionService.add(position);

    }
}
