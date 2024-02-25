package com.submission.schoolservice.infrastructure.config.database.schema;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.submission.schoolservice.util.enums.StatusType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "school")
public class School extends BaseEntity {

    @NotBlank(message = "Name is mandatory")
    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 1)
    private StatusType status;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "school")
    private Set<Classroom> classrooms;

}
