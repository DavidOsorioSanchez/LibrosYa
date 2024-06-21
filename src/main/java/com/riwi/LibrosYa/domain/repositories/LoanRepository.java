package com.riwi.LibrosYa.domain.repositories;

import com.riwi.LibrosYa.domain.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}
