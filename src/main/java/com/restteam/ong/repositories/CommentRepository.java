package com.restteam.ong.repositories;

import com.restteam.ong.models.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Long>{

    List<Comment> findAllByOrderByCreatedAt();
}
