package com.example.gen.repo.impl;

import com.example.gen.po.TbUser;
import com.example.gen.dao.TbUserMapper;
import com.example.gen.repo.TbUserRepo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class TbUserRepoImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserRepo {
}