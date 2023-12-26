package com.example.coroutines

import com.google.gson.GsonBuilder

fun main() {
    val newTestModelJsonStr =
        "{\r\n \"employeeList\": [\r\n [\r\n {\r\n \"name\": \"kalyan\",\r\n \"practice\": \"Manager\",\r\n \"experience\": 15,\r\n \"skill\": [\r\n \"iOS\"\r\n ]\r\n },\r\n {\r\n \"name\": \"Praveen\",\r\n \"practice\": \"Manager\",\r\n \"experience\": 20,\r\n \"skill\": [\r\n \"SQL\"\r\n ]\r\n }\r\n ],\r\n [\r\n {\r\n \"name\": \"Suhail\",\r\n \"practice\": \"Web\",\r\n \"experience\": 12,\r\n \"skill\": [\r\n \"Angular\",\r\n \"Flutter\"\r\n ]\r\n },\r\n {\r\n \"name\": \"Pavitra\",\r\n \"practice\": \"Cloud\",\r\n \"experience\": 8,\r\n \"skill\": [\r\n \"Azure Devops\",\r\n \"SAP\"\r\n ]\r\n },\r\n {\r\n \"name\": \"Swetha\",\r\n \"practice\": \"Mobile\",\r\n \"experience\": 12,\r\n \"skill\": [\r\n \"Azure Devops\",\r\n \"iOS\",\r\n \"Android\",\r\n \"Flutter\",\r\n \"KMP\"\r\n ]\r\n },\r\n {\r\n \"name\": \"Harika\",\r\n \"practice\": \"Web\",\r\n \"experience\": 11,\r\n \"skill\": [\r\n \"Angular\",\r\n \"CRM\"\r\n ]\r\n },\r\n {\r\n \"name\": \"Manoj\",\r\n \"practice\": \"Cloud\",\r\n \"experience\": 9,\r\n \"skill\": [\r\n \"AWS Devops\",\r\n \"iOS\"\r\n ]\r\n },\r\n {\r\n \"name\": \"Harika\",\r\n \"practice\": \"Web\",\r\n \"experience\": 11,\r\n \"skill\": [\r\n \"Angular\",\r\n \"CRM\"\r\n ]\r\n }\r\n ],\r\n [\r\n {\r\n \"name\": \"Eswar\",\r\n \"practice\": \"Backend\",\r\n \"experience\": 5,\r\n \"skill\": [\r\n \"SQL\",\r\n \"Angular\"\r\n ]\r\n },\r\n {\r\n \"name\": \"Harsha\",\r\n \"practice\": \"Mobile\",\r\n \"experience\": 1,\r\n \"skill\": [\r\n \"Android\",\r\n \"Flutter\"\r\n ]\r\n },\r\n {\r\n \"name\": \"Shinde\",\r\n \"practice\": \"Cloud\",\r\n \"experience\": 0.5,\r\n \"skill\": [\r\n \"AWS Devops\"\r\n ]\r\n }\r\n ]\r\n ]\r\n}"
    val newEmployeeData =
        GsonBuilder().create().fromJson(newTestModelJsonStr, NewTestModel::class.java)

    newEmployeeData.employeeList?.forEach {
        //println(it)
        it?.forEach{i->i?.practice
            when(i?.practice){
                "Mobile" -> {
               // println("People with mobile practice are ${i.name}")
                }
            }
        }
//
//        it?.forEach { j -> j?.skill
//            j?.skill?.forEach {
//                //if (k == "Angular") println("People with iOS skill set are ${j.name}")
//            }
//        }
        it?.forEach {j -> j?.skill
            j?.skill?.distinct()?.forEach {k ->k
                println("result 3 is $k")
            }
           // println("result 1 is ${j?.skill}")
        }
        it?.forEach {l->l?.experience

        }
    }
}