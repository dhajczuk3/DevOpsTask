sudo yum update -y
sudo yum install docker -y
sudo apt update
sudo apt install apt-transport-https ca-certificates curl software-properties-common
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
sudo apt update
sudo apt install docker-ce
sudo systemctl status docker
sudo docker run -d -p 8080:8080 -p 50000:50000 --name jenkins jenkins/jenkins:lts
sudo apt update
sudo apt install git
git config --global user.name "dhajczuk3"
git config --global user.email "dhajczuk@gmail.com"
git clone https://github.com/dhajczuk3/DevOpsTask.git
git clone git@github.com:dhajczuk3/DevOpsTask.git
cd DevOpsTask
nano Dec2Hex.java
git add Dec2Hex.java
git commit -m "Dec2Hex.java file added."
git push origin master
git branch
git push origin main
sudo apt update
sudo apt install -y openjdk-17-jre
sudo apt install -y default-jdk
curl -fsSL https://pkg.jenkins.io/debian/jenkins.io-2023.key | sudo tee     /usr/share/keyrings/jenkins-keyring.asc > /dev/null
sudo apt-get install -y fontconfig 
sudo apt-get install -y jenkins
sudo usermod -a -G docker jenkins
sudo apt-get install -y jenkins
sudo adduser jenkins docker
sudo cat /var/lib/jenkins/secrets/initialAdminPassword
ls
dir
/var/jenkins_home/secrets/initialAdminPassword
