package de.unibayreuth.se.campuscoffee.domain.model;

import lombok.Data;
import lombok.NonNull;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Domain class that stores the user metadata.
 */
@Data
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id; // null when the user has not been created yet
    // Implement user domain class. Hint: the @Nullable annotations are important for the Lombok @Data annotation (see https://projectlombok.org/features/Data).
    private LocalDateTime createdAt = LocalDateTime.now(ZoneId.of("UTC"));; // is null when using DTO to create a new POS
    private LocalDateTime updatedAt = createdAt;
    @NonNull
    private String loginName;
    @NonNull
    private String email;
    @NonNull
    private String surename;
    @NonNull
    private String name;
}
