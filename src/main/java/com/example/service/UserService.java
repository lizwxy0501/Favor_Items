package com.example.service;

import com.example.Entity.User;
import com.example.dao.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserService {
    @Resource//database api
    private UserRepository userRepository;

    //use method in api to manage database
    public void save(User user) {
        String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        user.setCreateTime(now);
        userRepository.save(user);
    }
//    public void update(User user){
//        UserRepository.save(user);
//    }//same as add, add: not include id, update: include id
    public void delete(Long id){
        userRepository.deleteById(id);
    }
    public User findById(long id){
        User user = userRepository.findById(id).orElse(null);
        return user;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
    public Page<User> findPage(Integer pageNum, Integer pageSize, String name){
        Sort sort = Sort.by(Sort.Direction.DESC, "create_time");
//        Pageable pageable = PageRequest.of(pageNum-1, pageSize, sort);
//        return UserRepository.findAll(pageable);
        PageRequest request =PageRequest.of(pageNum-1, pageSize, sort);
        return userRepository.findByNameLike(name, request);
    }
}
