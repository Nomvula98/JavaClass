package com.xgileit.controllers;

import com.xgileit.entities.Subject;
import com.xgileit.services.SubjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v2/subject")
public class SubjectController {
SubjectService subjectService= new SubjectService();
List<Subject> subjectList = new ArrayList<>();
        /**
         * End-point for registering a subject and store in database
         * @param subject represents the subject details
         * @return a string confirming successful submission or not
         **/
        @PostMapping("/registerSubject")
        public String registerSubject(@RequestBody Subject subject){
            return subjectService.registerSubject(subject);
        }

        /**
         * End-point for Retrieving all subjects that are stored in database
         * @return a List of subjects
         **/
        @GetMapping("/retrieveAllSubjects")
        public List<Subject> retrieveAllSubjects(){
            subjectList = subjectService.retrieveAllSubjects();
            return subjectList;
        }

        /**
         * End-point for Updating subject details of the corresponding code passed in URL
         * @param subjectCode identifies the subject details to be updated
         * @param subject represents subject details
         * @return a String confirming successful update
         **/
        @PutMapping("/update/{subjectCode}")
        public String updateSubjectDetails(@PathVariable Long subjectCode, @RequestBody Subject subject){
            return subjectService.updateSubjectInfo(subjectCode, subject);
        }

        /**
         * End-point for Deleting subject of the corresponding code passed in URL
         * @param subjectCode identifies the subject details to be deleted
         * @return a String confirming successful delete
         **/
        @DeleteMapping("/delete/{subjectCode}")
        public String deleteSubject(@PathVariable Long subjectCode){
            return "deleted";
        }
}
