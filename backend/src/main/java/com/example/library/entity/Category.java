package com.example.library.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Entity
@Table(name="categories", uniqueConstraints=@UniqueConstraint(columnNames="name"))
@Data
public class Category {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  @NotBlank(message="Category name required")
  @Column(nullable=false, unique=true)
  private String name;
  private String description;
}