package tri.lo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tri.lo.model.Blog;
import tri.lo.repository.BlogRepository;
import tri.lo.service.BlogService;

public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Iterable<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findOne(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.delete(id);
    }
}
