package ru.rtk.service.reportservice.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.rtk.service.reportservice.model.WorkType;

import java.util.UUID;

/**
 * Интерфейс репозитирия типа работ
 *
 * @author rnikonov
 */
public interface WorkTypeRepository extends JpaRepository<WorkType, UUID> {
    /**
     * Метод поиска типа работ по транслитному наименованию
     *
     * @param translitName транслитное наименование
     * @return тип работ
     */
    WorkType findByTranslitName(String translitName);

    /**
     * Метод поиска типа работ по роли пользователя
     *
     * @param role роль пользователя
     * @return тип работ
     */
    WorkType findFirstByRole(String role);

    /**
     * Метод поиска типа работ по идентификатору
     *
     * @param id идентификатор типа работ
     * @return тип работ
     */
    WorkType findFirstById(UUID id);

    @Override
    void deleteById(@NotNull UUID uuid);
}
