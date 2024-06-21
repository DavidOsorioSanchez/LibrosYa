package com.riwi.LibrosYa.domain.entities;

import com.riwi.LibrosYa.Util.enums.Genre;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    private String Author;
    private LocalDateTime publicationYear;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    private  String isbn;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "book",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    private List<Loan> loan;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "book",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    private List<Reservation> reservations;
}
