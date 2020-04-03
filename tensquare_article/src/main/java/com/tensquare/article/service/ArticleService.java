package com.tensquare.article.service;

import com.tensquare.article.dao.ArticleDao;
import com.tensquare.article.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Description:
 * User: HC
 * Date: 2020-04-03-23:51
 */
@Transactional
@Service
public class ArticleService {
    @Autowired
    private ArticleDao articleDao;

    /**
     * 查询所有
     *
     * @return
     */
    public List<Article> findAll() {
        return articleDao.selectList(null);
    }
}
