# Android environment
import unittest
from appium import webdriver

desired_caps = {}
desired_caps['platformName'] = 'Android'
desired_caps['platformVersion'] = '5.1'
desired_caps['deviceName'] = 'Android Emulator'
desired_caps['app'] = '/Users/taewoo/Documents/Unopen.Lab/TWpower/Undang-Android/app/build/outputs/apk/debug/app-debug.apk'

driver = webdriver.Remote('http://localhost:4723/wd/hub', desired_caps)
driver.switch_to.context('WEBVIEW')

assert '지금 한강은' in driver.page_source
driver.quit()