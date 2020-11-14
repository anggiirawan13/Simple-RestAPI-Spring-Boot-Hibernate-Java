# Simple-RestAPI-Spring-Boot-Hibernate-Java

~ git clone https://github.com/Mr-Cloud13/Simple-RestAPI-Spring-Boot-Hibernate-Java

~ open src/main/resources/application.properties and setup your connection to database

# POSTMAN

~ POST DATA

        url = http://localhost:{YOUR PORT}/v1/personalData/add
        
        {
          "name": "Mr. Cloud"
        }
        
~ GET ALL DATA

        url = http://localhost:{YOUR PORT}/v1/personalData/getAll
        
~ GET DATA BY ID

        url = http://localhost:{YOUR PORT}/v1/personalData/getById/{ID DATA}
        
~ UPDATE DATA BY ID

        url = http://localhost:{YOUR PORT}/v1/personalData/updateById/{ID DATA}
        
        
        {
          "name": "Mr. Cloud`s"
        }
        
~ DELETE DATA BY ID

        url = http://localhost:{YOUR PORT}/v1/personalData/deleteById/{ID DATA}
