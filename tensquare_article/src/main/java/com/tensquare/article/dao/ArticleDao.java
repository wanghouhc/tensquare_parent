package com.tensquare.article.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tensquare.article.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description:
 * User: HC
 * Date: 2020-04-03-23:43
 */
@Mapper
public interface ArticleDao extends BaseMapper<Article>{
}
