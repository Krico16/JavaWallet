package xyz.krico16.bankapp.application.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.krico16.bankapp.application.DTOModels.request.UserRequest;
import xyz.krico16.bankapp.application.DTOModels.response.UserResponse;
import xyz.krico16.bankapp.infrastructure.abstract_service.IUserService;
import java.util.UUID;

@RestController
@RequestMapping(path = "user")
@AllArgsConstructor
public class UserController {

    private final IUserService userService;


    // Response entity para todos los mappers
    @PostMapping
    public ResponseEntity<UserResponse> createUser(
            @RequestBody UserRequest request
    ) {
        return ResponseEntity.ok(userService.create(request));
    }

    @GetMapping(path = "{uuid}")
    public ResponseEntity<UserResponse> getUserById(
            @PathVariable String uuid
    ) {
        UUID convertedId = UUID.fromString(uuid);
        return ResponseEntity.ok(userService.FindById(convertedId));
    }

}
