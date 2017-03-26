from flask import Flask, request
from flask_restful import Resource, Api
from json import dumps
from flask import send_file
import subprocess
import os
import requests
from time import sleep
# Python 3


app = Flask(__name__)
api = Api(app)


class hack(Resource):
    def get_img(self):
        os.system('adb shell screencap {}'.format('/sdcard/screen.png'))
        os.system('adb pull {} {}'.format('/sdcard/screen.png', 'screen.png'))
        return send_file('screen.png', mimetype='image/gif')

    def get(self):
        return self.get_img()

    def post(self):
        request.get_data()
        x = int(request.json['x'])
        y = int(request.json['y']) + 20
        os.system('adb shell input tap {} {}'.format(x, y))
        sleep(0.2)
        return self.get_img()


api.add_resource(hack, '/hack')

if __name__ == '__main__':
    app.run(host='0.0.0.0')
