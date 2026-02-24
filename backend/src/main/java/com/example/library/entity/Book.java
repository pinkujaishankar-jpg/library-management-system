package com.example.library.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.time.LocalDate;
@Entity
@Table(name="books", uniqueConstraints=@UniqueConstraint(columnNames="isbn"))
@Data
public class Book {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  @NotBlank private String bookName;
  @NotBlank private String author;
  @NotBlank @Column(unique=true) private String isbn;
  @NotNull private LocalDate publishedDate;
  @ManyToOne
  @JoinColumn(name="category_id", nullable=false)
  private Category category;
}