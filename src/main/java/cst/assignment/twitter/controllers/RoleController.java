package cst.assignment.twitter.controllers;

import java.util.List;

import cst.assignment.twitter.services.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import cst.assignment.twitter.models.Role;
import cst.assignment.twitter.services.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    private final UserManagementService userManagementService;


    @Autowired
    public RoleController (UserManagementService userManagementService) {
        this.userManagementService = userManagementService;
    }


    @GetMapping("/allRoles")
    public ResponseEntity<List<Role>> getAllRoles( @RequestHeader("Authorization") String authorizationHeader) {



        if (authorizationHeader != null) {
            String token = authorizationHeader;
            System.out.println("the token is " + token);


            if (userManagementService.authorizeRequest(token)) {

                return ResponseEntity.ok(roleService.getAllRoles());
            }
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();

    }

    @GetMapping("/role/{id}")
    public ResponseEntity<Role> getRole(@PathVariable int id,  @RequestHeader("Authorization") String authorizationHeader) {

        if (authorizationHeader != null) {
            String token = authorizationHeader;
            System.out.println("the token is " + token);


            if (userManagementService.authorizeRequest(token)) {

                return ResponseEntity.ok(roleService.getRoleById(id));
            }
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }


}
