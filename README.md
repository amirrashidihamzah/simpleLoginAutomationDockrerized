Dockerize selenium login page automation

#Prerequisite 
1. Install Java - JDK
   go to https://www.oracle.com/my/java/technologies/downloads/#java17 to download jdk 17 based on your pc, we will used java 17 for this project, After succesfully install run this command on ur cmd if this appeared means u 
   installed java succesfully
     ![image](https://github.com/user-attachments/assets/e436b1c4-1f9b-40c6-8ebe-f917664e3c55)
2. Download IntelliJ community edition from https://www.jetbrains.com/idea/download/other.html, im using IntelliJ IDEA 2023.3.6 (Community Edition), install the file
3. After finishing install just open the IDE.
4. clone this project onto ur local computer in any directory u want using git clone https(name of the repo)
5. Open the project that ur clone into the IDE, example below
   ![image](https://github.com/user-attachments/assets/e0013de2-b027-4433-8a5d-4649491f7de0)
6. When u open the project, maven will download all the necessary file, just wait until it finished   
7. Install Lombok Plugin (if necessary):
   Go to File > Settings (or IntelliJ IDEA > Preferences on macOS).
   Navigate to Plugins.
   Search for "Lombok" in the Marketplace tab.
   Install the Lombok plugin and restart IntelliJ IDEA if prompted.
   ![image](https://github.com/user-attachments/assets/b14172f0-967a-4dc2-a7bf-7cbfcfb79c47)
   just focus on the lombok part, annotation processing should be prompted when u restart the IDE
8. Install docker desktop as we want to run the test in a docker container
9. After finish installing the docker open the path of ur project that contains the dockerfile and docker-compose, example here
. ![image](https://github.com/user-attachments/assets/d353cedd-5908-4e32-a7e2-91d50c73f228)
10. run docker-compose build command in ur cmd (this one to build the image in our docker-compose), for this docker engine must be run(In our case docker desktop)
11. after finish build, run command docker-compose up, u can check all the service run here in docker desktop as shown below
   ![image](https://github.com/user-attachments/assets/6bc3027e-f2a6-4d9d-924d-031ec1240038)
   this means our service already up
12. Check our node already start in this localhost:4444/grid/console, it should be create all our nodes
13. If all step complete without any error we can just run our test now, just go to this class and click run test
   ![image](https://github.com/user-attachments/assets/151f5e6c-cd6c-49b9-9d40-bef00f7c83b3)
14. This test will record the video that we mount to our local directory, in order to access video simply stop the service in docker desktop
    ![image](https://github.com/user-attachments/assets/456dcae9-e3ba-441e-a0b3-45a06aa77dd3)



 

   
