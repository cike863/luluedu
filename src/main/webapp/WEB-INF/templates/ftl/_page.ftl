<ul class="pagination" style="margin-top: 0">
	<#if (pageNo>1)>
	<li class="prev"><a href="${url}/${(pageNo-1)?c}?${queryString}" rel="prev">«上一页</a></li>
	</#if>
	
	<#--页码范围小于7 -->
	<#if (totalPage<=7)>
       <#list 1..totalPage as i>
         <#if (i>0)>
           <#if (pageNo==i)>
           	 <li class="active"><a href="javascript:;">${pageNo?c}</a></li>
             <#else>
             <li><a href="${url}/${i?c}?${queryString}">${i?c}</a></li>
           </#if>
         </#if>
       </#list>      
    <#else>
      <#list 1..2 as i>
          <#if (pageNo==i)>
            <li class="active"><a href="javascript:;">${pageNo?c}</a></li>
            <#else>
            <li><a href="${url}/${i?c}?${queryString}">${i?c}</a></li>
          </#if>           
      </#list>
      <#if (pageNo<6)>
         <#list 3..6 as i>
          <#if (pageNo==i)>
            <li class="active"><a href="javascript:;">${pageNo?c}</a></li>
            <#else>
            <li><a href="${url}/${i?c}?${queryString}">${i?c}</a></li>
          </#if>           
         </#list>
         <li><a href="javascript:;">...</a></li>
      <#elseif (pageNo>=totalPage-5)>
          <li><a href="javascript:;">...</a></li>
          <#list totalPage-5..totalPage-2 as i>
          <#if (pageNo==i)>
            <li class="active"><a href="javascript:;">${pageNo?c}</a></li>
            <#else>
            <li><a href="${url}/${i?c}?${queryString}" name="${i?c}">${i?c}</a></li>
          </#if>           
         </#list>  
      <#elseif (pageNo<totalPage-5)>
          <li><a href="javascript:;">...</a></li>
          <#list pageNo..pageNo+3 as i>
          <#if (pageNo==i)>
            <li class="active"><a href="javascript:;">${pageNo?c}</a></span></li>
            <#else>
            <li><a href="${url}/${i?c}?${queryString}" name="${i?c}">${i?c}</a></li>
          </#if>           
         </#list>  
         <li><a href="javascript:;">...</a></li>                
       </#if>
       
       <#--最后一页-->
       <#list totalPage-1..totalPage as i>
            <#if (pageNo==i)>
             <li class="active"><a href="javascript:;">${pageNo?c}</a></li>
            <#else>
             <li><a href="${url}/${i?c}?${queryString}" name="${i?c}">${i?c}</a></li>
            </#if>    
       </#list>
    </#if>
	
	<#if (pageNo<totalPage)>
	<li class="next"><a href="${url}/${(pageNo+1)?c}?${queryString}" rel="next">下一页»</a></li>
	</#if>
</ul>