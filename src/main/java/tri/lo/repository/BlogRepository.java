package tri.lo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import tri.lo.model.Blog;

public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {
}
