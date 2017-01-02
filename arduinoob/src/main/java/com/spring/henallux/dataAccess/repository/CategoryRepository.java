package com.spring.henallux.dataAccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.entity.TranslationCategoryEntity;

@Repository
@Transactional
public interface CategoryRepository extends JpaRepository<TranslationCategoryEntity, Integer>{

}
