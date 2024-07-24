package main

import (
	"calculator-client-service/routers"
	"github.com/gin-gonic/gin"
)

func main() {

	router := gin.Default()
	router.StaticFile("template/", "./template")
	router.LoadHTMLGlob("template/*")
	router.GET("/", routers.HomePage)
	router.POST("/", routers.AddHandlerPost)
	router.Run(":9090")
}
