package net.javaguides.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Table(name = "employees")
public class Employee {
    @Id
@Setter
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "emp_id")
    private int id;
@Column(name = "emp_first_name")
    private String firstName;
@Column(name = "emp_last_name")
    private String lastName;
@Column(name = "emp_email")
    private String emailId;

}
