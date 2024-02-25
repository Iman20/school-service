package com.submission.schoolservice.infrastructure.config.database.schema;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.submission.schoolservice.util.enums.StatusType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student extends BaseEntity {

    @NotBlank(message = "Name is mandatory")
    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 1)
    private StatusType status;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "classroom_id", nullable = false)
    private Classroom classroom;

}