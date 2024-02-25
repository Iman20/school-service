package com.submission.attendanceservice.infrastructure.config.database.schema;

import com.submission.attendanceservice.util.enums.AttendanceType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "attendance")
public class Attendance extends BaseEntity {

    private String studentId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AttendanceType attendance;
}

