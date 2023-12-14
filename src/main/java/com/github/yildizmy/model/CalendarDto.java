package com.github.yildizmy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CalendarDto {
    private int day;
    private String month;
    private int year;
    private String dayOfWeek;
}
