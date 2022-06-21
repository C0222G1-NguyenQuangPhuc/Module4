package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = "select * from blog where status_delete = 1", nativeQuery = true)
    List<Blog> findAllBlog();

    @Modifying
    @Query(value = "insert into blog (name_blog, author, description, date_create, status_delete) values (:nameBlog, :author, :description, :dateCreate, 1)", nativeQuery = true)
    void save(@Param("nameBlog") String nameBlog, @Param("author") String author, @Param("description") String description, @Param("dateCreate") String dateCreate);

    @Query(value = "select * from blog where id_blog = :id", nativeQuery = true)
    Blog findByIdBlog(@Param("id") Integer id);

    @Modifying
    @Query(value = "update blog set name_blog = :name, author = :author, description = :description, date_create = :date where id_blog = :id", nativeQuery = true)
    void update(@Param("name") String name, @Param("author") String author, @Param("description") String description, @Param("date") String date, @Param("id") Integer id);

    @Modifying
    @Query(value = "update blog set status_delete = 0 where id_blog = :id", nativeQuery = true)
    void delete(@Param("id") Integer id);
}
