//package com.sandeep.productservice.inheritanceDemo.singleTable;
//
//import com.sandeep.productservice.ProductserviceApplication;
//import com.sandeep.productservice.inheritanceDemo.singleTable.repository.MentorRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public  class Main implements CommandLineRunner{
//
//
//    private MentorRepository mentorRepository;
//    public Main(@Qualifier("st_mr") MentorRepository mentorRepository){
//        this.mentorRepository = mentorRepository;
//    }
//    public static void main(String[] args) {
//        SpringApplication.run(ProductserviceApplication.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Mentor mentor = new Mentor();
//        mentor.setName("Sandeep");
//        mentor.setEmail("sandeep.singh@bankopen.co");
//        mentor.setMobile("9140401247");
//        mentor.setAvgRating("5*");
//        mentorRepository.save(mentor);
//    }
//}
