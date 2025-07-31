# Creating a simple freestyle job in jenkins (Also for running a pipeline) 

Basically cretaing a free style job in jenkins is done using UI mostly and once the job is created then we will enter into the job and look for **configure** tab in the side bar and then 
1. Add Github url for cloning the repository locally and add the github credentials in the jenkins credentials tab
2. Then Add the Build setup ad click on invoke top maven... option in dropdown
3. Add the command of your desired work like
   - Test the application
   - Build the application
4. And click on save
5. Then at last click on Build option in the sidebar
6. It will take some time and then the build will be either successful or failed and we can view the console outputs os the build.

Boom! we created a simple freestyle job in jenkins

### Additional 

If you want to check them locally( Server ) like what jobs are created and stuff related to jenkins configurations

Then use the following command

```bash
ls /var/lib/jenkins_home   # Directory where jenkins files are going to save in the os
ls /var/lib/jenkins_home/jobs  # to see how many jobs we have 
ls /var/lib/jenkins_home/workspace # to see the git checouts
```
