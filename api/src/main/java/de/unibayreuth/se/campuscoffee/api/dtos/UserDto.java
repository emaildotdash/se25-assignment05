package de.unibayreuth.se.campuscoffee.api.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * DTO for user metadata.
 *
 */
@Data
@Builder(toBuilder = true)
public class UserDto {
    private Long id; // id is null when creating a new task
    // TODO: Implement user DTO.
    private LocalDateTime createdAt; // is null when using DTO to create a new POS
    private LocalDateTime updatedAt;
    @Pattern(regexp = "^([a-z]*[A-Z]*)*$", message = "The login name can only contain letters.")
    private String loginName;
    @Email
    private String email;
    @NotBlank(message = "Surename cannot be empty.")
    @Size(max = 255, message = "Surename can be at most 255 characters long.")
    private String surename;
    @NotBlank(message = "Name cannot be empty.")
    @Size(max = 255, message = "Name can be at most 255 characters long.")
    private String name;
}
