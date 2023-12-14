package com.github.yildizmy.controller;

import com.github.yildizmy.model.CalendarDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/calendar")
@Slf4j
public class CalendarController {
    @GetMapping
    public ResponseEntity<CalendarDto> getCurrentDay(){
        log.info("Client GET request to /api/v1/calendar");
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        String month = currentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        int year = currentDate.getYear();
        String dayOfWeek = currentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        return ResponseEntity.ok(new CalendarDto(day, month, year, dayOfWeek));
    }
}
