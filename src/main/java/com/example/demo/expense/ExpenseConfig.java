package com.example.demo.expense;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class ExpenseConfig {

    @Bean
    CommandLineRunner commandLineRunner(ExpenseRepository repository) {
        return args -> {
            // ✅ Condition is inside the lambda — so the bean is never null
            if (repository.count() == 0) {
                Expense e1 = new Expense("Weekly groceries",
                        150.50,
                        LocalDate.of(2026, 6, 15),
                        "groceries");

                Expense e2 = new Expense("Monthly rent",
                        1200.00,
                        LocalDate.of(2026, 6, 1),
                        "rent");

                repository.saveAll(List.of(e1, e2));
                System.out.println("✅ Sample expenses inserted!");
            } else {
                System.out.println("ℹ️ Expenses already exist. Skipping sample data.");
            }
        };
    }
}