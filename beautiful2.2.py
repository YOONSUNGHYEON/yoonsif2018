from urllib.request import urlopen
from selenium import webdriver
from bs4 import BeautifulSoup as bs




driver = webdriver.Chrome('./chromedriver')
driver.implicitly_wait(3)

# 로그인 전용 화면
driver.get('https://www.instagram.com/accounts/login/')
# 아이디와 비밀번호 입력
driver.implicitly_wait(0.1)
driver.find_element_by_xpath("//div[@class='f0n8F ']/input[@name='username']").send_keys('')
driver.implicitly_wait(3)
driver.find_element_by_xpath("//div[@class='f0n8F ']/input[@name='password']").send_keys('')
driver.find_element_by_xpath('//span[@class="-Qhn2 _1OSdk"]/button[@class="_5f5mN       jIbKX KUBKM      yZn4P   "]').click()
driver.implicitly_wait(2)
driver.find_element_by_xpath('//div[@class="pbgfb Di7vw "]').click()


driver.find_element_by_xpath("//input[@class='XTCLo x3qfX ']").send_keys('혼밥')

driver.find_element_by_xpath('//a[@href="/explore/tags/혼밥/"]').click()

