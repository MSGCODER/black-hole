<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/css/bootstrap/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/common.css" />
    <link rel="stylesheet" href="/css/footer.css" />
    <script type="text/javascript" src="/js/jquery-2.1.4.js" ></script>
    <script type="text/javascript" src="/js/bootstrap/bootstrap.min.js" ></script>
    <title>艺术品列表</title>
</head>
<body>
    <div class="container content">
        <%-- header --%>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/">BlackHole</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">美图 </a></li>
                        <li><a href="#">酷站</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">Separated link</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">One more separated link</a></li>
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">搜索</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">您好！XXX</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">Separated link</a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        <div class="item-list">
            <%-- 项列表 --%>
            <div class="item art-work">
                <img src="/img/example/1.jpg" />
                <h4>标题</h4>
            </div>
            <div class="item art-work">
                <img src="/img/example/1.jpg" />
                <h4>标题</h4>
            </div>
            <div class="item art-work">
                <img src="/img/example/1.jpg" />
                <h4>标题</h4>
            </div>

            <div class="item art-work">
                <img src="/img/example/1.jpg" />
                <h4>标题</h4>
            </div>
            <div class="item art-work">
                <img src="/img/example/1.jpg" />
                <h4>标题</h4>
            </div>
            <div class="item art-work">
                <img src="/img/example/1.jpg" />
                <h4>标题</h4>
            </div>

            <div class="item art-work">
                <img src="/img/example/1.jpg" />
                <h4>标题</h4>
            </div>
            <div class="item art-work">
                <img src="/img/example/1.jpg" />
                <h4>标题</h4>
            </div>
            <div class="item art-work">
                <img src="/img/example/1.jpg" />
                <h4>标题</h4>
            </div>
            <%-- 分页信息 --%>
            <nav class="paging">
                <ul class="pagination pagination-lg">
                    <li>
                        <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li>
                        <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
        <footer role="contentinfo" class="bs-docs-footer">
            <div class="container">
                <ul class="bs-docs-footer-links text-muted">
                    <li>@MSGCODER</li>
                </ul>
            </div>
        </footer>
    </div>
</body>
</html>
