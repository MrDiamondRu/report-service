package ru.rtk.service.reportservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

/**
 * Тип работ
 *
 * @author rnikonov
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WorkType {
    /**
     * id записи
     */
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    /**
     * Название
     */
    private String name;

    /**
     * Название транслитерацией
     */
    private String translitName;

    /**
     * Условные номера соответствующие работам
     */
    private String codeList;

    /**
     * Является ли мероприятие РЕМ
     */
    private Boolean isRem;

    /**
     * Максимальное количество страниц дела
     */
    private Integer maxFolderPageCount;

    /**
     * Роли пользователей
     */
    private String role;
}
