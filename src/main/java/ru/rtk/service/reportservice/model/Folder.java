package ru.rtk.service.reportservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

/**
 * Дело
 *
 * @author rnikonov
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Folder {
    /**
     * id записи
     */
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    /**
     * Тип работ
     */
    @ManyToOne(fetch = FetchType.EAGER)
    private WorkType workType;

    /**
     * Номер
     */
    private String number;

    /**
     * Год
     */
    private Integer year;

    /**
     * Конструктор для создания нового пустого дела
     *
     * @param workType тип мероприятия
     * @param year выбранный год
     */
    public Folder(WorkType workType, Integer year) {
        this.workType = workType;
        this.number = "_______";
        this.year = year;
    }

}
