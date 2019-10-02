package tri.lo.service;

import tri.lo.model.Blog;


public interface BlogService {
    Iterable<Blog> findAll();

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
