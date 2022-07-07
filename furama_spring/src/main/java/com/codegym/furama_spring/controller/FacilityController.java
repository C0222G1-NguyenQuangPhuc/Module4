package com.codegym.furama_spring.controller;

import com.codegym.furama_spring.model.facility.Facility;
import com.codegym.furama_spring.service.facility.IFacilityService;
import com.codegym.furama_spring.service.facility.IFacilityTypeService;
import com.codegym.furama_spring.service.facility.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@RestController
@RequestMapping("/facility")
public class FacilityController {

    @Autowired
    private IFacilityService iFacilityService;

    @Autowired
    private IFacilityTypeService iFacilityTypeService;

    @Autowired
    private IRentTypeService iRentTypeService;

    @GetMapping("")
    public ModelAndView showListFacility(@RequestParam(name = "page", defaultValue = "0") int page) {
        Sort sort = Sort.by("facility_id").ascending();
        ModelAndView model = new ModelAndView("/facility/list");
        Page<Facility> facilityList = iFacilityService.findAllFacility(PageRequest.of(page, 4, sort));
        model.addObject("facilityList", facilityList);
        model.addObject("facilityTypeList", iFacilityTypeService.findAll());
        model.addObject("rentTypeList", iRentTypeService.findAll());
        return model;
    }

    @PostMapping("/save")
    public ResponseEntity<?> createEmployee(@Valid @RequestBody Facility facility) {
        iFacilityService.save(facility);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/edit")
    public ResponseEntity<?> editEmployee(@Valid @RequestBody Facility facility) {
        iFacilityService.save(facility);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Integer id) {
        iFacilityService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
