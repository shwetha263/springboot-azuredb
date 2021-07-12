# Notes

## Prerequisites 

- Have AzureSQL db and have a simple todo table 
  ``` sql
    CREATE TABLE [wishlist].[todo] (
    id int NOT NULL,
    description varchar(255) NULL,
    details varchar(255) NULL,
    done bit NULL,
    CONSTRAINT PK_TODO_PK PRIMARY KEY CLUSTERED (id)
    )
    ```
- Set the environment with the following variables 
  - DB_DATABASE
  - DB_USER
  - DB_PASS
  - DB_PORT
    
## Run the application 

Run the app as any springboot application and  the api's are as listed in the swagger http://localhost:8080/swagger-ui.html.
    # springboot-azuredb
