
function cxpPanelToggle(link) {
	$(link).closest('div.section-heading').next('div.section-body').toggleClass('in');
	var toggleButton = $(link).closest('div.section-heading').find('div.section-toggle a');
	var toggleTitle = $(link).closest('div.section-heading').find('div.cxp-panel-title a');
	toggleButton.toggleClass('collapsed');
	if (toggleButton.attr('aria-expanded') == 'true') {
		toggleButton.attr('aria-expanded', 'false');
		toggleTitle.attr('aria-expanded', 'false');
	} else {
		toggleButton.attr('aria-expanded', 'true');
		toggleTitle.attr('aria-expanded', 'true');
	};
}
$(document).on('click', '.expandCollapseAll', function () {
	console.log('clicked');
	var table=$('.SearchResults').dataTable().api();
	//console.log("table is "+JSON.stringify(table));
	table.rows().every( function ( rowIdx, tableLoop, rowLoop ) {
	    var data = this.data();
	    console.log('data is'+data);
	    // ... do something with data(), or this.node(), etc
	} );
	table.$('tr').trigger('click');
	 table.$('tr').find('td:last-child').trigger('click');
}
);
