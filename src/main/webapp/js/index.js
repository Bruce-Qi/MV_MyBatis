$(function() {
	

	$('#index_content_info').tabs('add', {
		title : '指令汇科技',
		closable : true,
		fit : true,
		href : "person.html"
			
	});
	

	$('#index_menu_tree').tree({
		onClick : function(node) {
			var tabs = $('#index_content_info');
			var title="指令汇科技";
			href : "person.html"
			
			if (node.id == "pmManager") {

				if (tabs.tabs("exists", "人员管理")) {
					// 如果存在则选中
					tabs.tabs("select", "人员管理");
					return;	
				} else {
					title="人员管理";
					href="person.html";
				}
			} else{
				return;
			}
			

			tabs.tabs("add", {
				title : title,
				closable : true,
				fit : true,
				href : href
			});
		}
	});

});

