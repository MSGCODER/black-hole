<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="/css/bootstrap/bootstrap.min.css" />
  <title>The Black Hole</title>
</head>
<body>
  <div class="container">
    <h1>添加项目</h1>
    <form class="form-horizontal" enctype="multipart/form-data" method="post" action="/admin/artwork/new">
        <div class="form-group">
            <label for="serialNo" class="col-sm-2 control-label">番号</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="serialNo" name="serialNo" placeholder="番号">
            </div>
        </div>
        <div class="form-group">
            <label for="title" class="col-sm-2 control-label">标题</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="title" name="title" placeholder="标题">
            </div>
        </div>
        <div class="form-group">
            <label for="file" class="col-sm-2 control-label">封面</label>
            <div class="col-sm-10">
                <input type="file" class="" id="file" name="file" placeholder="封面">
            </div>
        </div>
        <div class="form-group">
            <label for="linkUrl" class="col-sm-2 control-label">链接</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="linkUrl" name="linkUrl" placeholder="链接">
            </div>
        </div>
        <div class="form-group">
            <label for="tag" class="col-sm-2 control-label">标签</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="tag" name="tag" placeholder="标签">
            </div>
        </div>
        <div class="form-group">
            <label for="company" class="col-sm-2 control-label">公司</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="company" name="company" placeholder="公司">
            </div>
        </div>
        <div class="form-group">
            <label for="country" class="col-sm-2 control-label">国家</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="country" name="country" placeholder="国家">
            </div>
        </div>
      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <button type="submit" class="btn btn-default">提交</button>
        </div>
      </div>
    </form>

  </div>

</body>
</html>
